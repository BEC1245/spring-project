package com.hi.app.controller;

import com.hi.app.domain.Report;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Log4j2
@Controller
@RequestMapping("/report")
public class FileUploadController {

    // get : 화면을 띄우는 작업
    @GetMapping("/report") // 이 어노테이션으로도 하위 경로를 설정 가능
    public String getReportForm(){

        log.info("Get /report");

        return "/report/reportForm";
    }

    // post : 파일 처리 -> 파일 이름확인, 사이즈, 파일 저장
    // 파일 저장을 하기 위해서는 지정 폴더를 설정하고 -> 해당 경로(웹경로 -> 시스템경로)로 파일을 저장
    // 이미지를 업로드 -> 웹패이지에서 확인

    @PostMapping("/submit1") // /report/submit1
    public String submit1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report") MultipartFile report, // 파일 받는 부분
            HttpServletRequest request,
            Model model
        ){

        log.info("post /report/submit1");

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);

        // 파일을 가져오는 MultipartFile의 메서드들
        log.info("파일 이름 : " + report.getOriginalFilename());
        log.info("파일 타입 : " + report.getContentType());
        log.info("파일 사이즈 : " + report.getSize());

        model.addAttribute("sname", sname);
        model.addAttribute("snum", snum);
        model.addAttribute("fileName", report.getOriginalFilename());

        // 업로드 경로
        // 서버 경로 /uploadfile/report -> webapp 폴더에 uploadfile 폴더 생성

        // 1. 지정하고자 하는 웹경로를 설정
        String uploadURI = "/uploadfile/report"; // -> http://localhost:8080/uploadfile/report

        // 2. 웹 경로(report 폴더) 기반으로 시스템 경로를 얻어옴 -> HttpServletRequest가 필요함
        // 웹 경로에서 서버의 현 파일 경로로 바꿔주는 값을 가져온다
        String dirPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirPath);

        // 3. 그 경로에 저장을 함 ( 파일의 이름을 변경해서 저장이 가능하기 때문에 저장을 함 )
        // 파일 경로를 받는 file 객체를 전달 후 transferTo()로 저장
        // 앞쪽에는 폴더 경로 뒤에는 파일의 이름으로 파일을 저장한다.
        // .....uploadfile\report\ + 받은 파일의 이름(file.png)

        File file = new File(dirPath, report.getOriginalFilename());
        try { report.transferTo(file); }
        catch (IOException e) { e.printStackTrace(); }

        log.info("파일 저장 완료");
        // 4. view의 저장 이미지 이름을 공유를 한다.


        return "/report/submit1";
    }

    // MultipartFile를 가져오는 다른 방법
    @PostMapping("/submit2")
    public String submit2(
            MultipartHttpServletRequest request,
            Model model
        ){
        //이름 학번 파일을 받는 코드
        String snum = request.getParameter("snum");
        String sname = request.getParameter("sname");
        MultipartFile report = request.getFile("report"); // 파일의 받는 이름을 입력

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("파일 이름 : " + report.getOriginalFilename());

        // 웹 경로
        String uploadURI = "/uploadfile/report";

        // 실 경로 request -> Session -> servletContext -> realPath
        String dirReadPath = request.getSession().getServletContext().getRealPath(uploadURI);

        // 새오룬 파일의 경로 구하기
        File file = new File(dirReadPath, report.getOriginalFilename());

        // 저장
        try {
            report.transferTo(file);
        } catch (IOException e){
            e.printStackTrace();
        }

        log.info("파일 저장 완료...");

        // view에 데이터 전달
        model.addAttribute("snum", snum);
        model.addAttribute("sname", sname);
        model.addAttribute("fileName", report.getOriginalFilename());

        return "/report/submit2";
    }

    // MultipartFile를 가져오는 또 다른 방법
    @PostMapping("/submit3")
    public String submit3(
            HttpServletRequest request,
            Report report
    ){

        log.info("학번 : " + report.getSnum());
        log.info("이름 : " + report.getSname());
        log.info("파일 이름 : " + report.getReport().getOriginalFilename());

        String uploadURI = "/uploadfile/report";

        String dirReadPath = request.getSession().getServletContext().getRealPath(uploadURI);

        log.info("파일 경로 : " + dirReadPath);

        File file = new File(dirReadPath, report.getReport().getOriginalFilename());

        try {
            report.getReport().transferTo(file);

        } catch (IOException e){
            e.printStackTrace();
        }

        log.info("파일 저장 완료...");

        return "/report/submit3";
    }

//    @PostMapping
//    public

}
