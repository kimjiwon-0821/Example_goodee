package collection.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	//1.학생정보초기화 - 학생들의 정보를 리턴해줘야함.
	public ArrayList<StudentDTO> init() {
		//StringBuffer을 문자열로 받아야함
		String data = sb.toString();
		data.replace(",", "");
		data.replace(" ", "-");
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<StudentDTO> ar = new ArrayList<>();//StudentDTO의 배열 생성
			//반복문으로 StudentDTO의 객체를 생성하여 값을 입력받는다.
			while(st.hasMoreTokens()){// while문은 더이상 나눌 token이 없을 때까지 반복
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
			}
		return ar;
		}
	
	
	//4.학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) {
		
	}
		
		
		
	}
