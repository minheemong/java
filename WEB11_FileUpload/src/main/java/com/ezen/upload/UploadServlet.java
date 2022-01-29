package com.ezen.upload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 파일 업로드를 위한 준비
		// 파일이 업로드될 타겟 폴더 이름 설정(표면적으로 대표되는 폴더)
		String savePath="fileUpload";
		
		// 업로드되는 파일의 최대 용량을 제한하기 위한 설정
		int uploadFileSizeLimit = 5 * 1024 * 1024; // 5메가바이트로 제한
		
		// 한글 인코딩 방법 설정
		String encType = "UTF-8";
		
		// 서버 상의 실제로 파일이 저장되는 디렉토리 설정
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		
		System.out.println(uploadFilePath);
		try {
			MultipartRequest multi = new MultipartRequest(
					request, // multipart/form-data 로 보낸 데이터는 일반 request로 전달받을 수 없습니다
					// 따라서 MultipartRequest에 request를 넣어서 복합사용되게 설정합니다
					uploadFilePath, // 서버상의 실제 디렉토리
					uploadFileSizeLimit, // 최대 업로드 파일 크기
					encType, // 인코딩 방법
					new DefaultFileRenamePolicy()
					// 업로드 파일과 동일 이름이 이미 존재하면 새 이름 부여
			);
			//MultipartRequest 객체가 생성되는 순간 업로드되는 파일은 해당 경로에 업로드를 완료합니다
			
			// jsp 파일의 form에서 전달된 파일의 이름 및 그 외 항목들을 파라미터로 추출
			String name = multi.getParameter("name");
			String title = multi.getParameter("title");
			String fileName = multi.getFilesystemName("uploadFile"); // 전달된 파일이름 추출
			
			// 서블릿에서 웹브라우저에 직접 내용을 써넣기 위한 ContentType 타입 설정
			response.setContentType("text/html; charset=UTF-8");
			// 브라우저에 쓰기 위한 객체를 생성
			PrintWriter out = response.getWriter();
			out.println("<br> 글쓴이 : " + name);
			out.println("<br> 제목 : " + title);
			out.println("<br> 파일명 : " + fileName);
		}catch(Exception e) {
			System.out.print("파일 업로드 되지 않았음 : " + e );
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
