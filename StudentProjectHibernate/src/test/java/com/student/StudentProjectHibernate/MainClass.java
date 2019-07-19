package com.student.StudentProjectHibernate;
public class MainClass {

	public static void main(String[] args) {


		// TODO Auto-generated constructor stub
		//	
		//		StudentDto std = new StudentDto();
		//		std.setId(3);
		//		std.setName("Seju");
		//		std.setEmail("Sejal@gmail.com");
		//		std.setStream("cse");
		//		
		//		StudentDto std1 = new StudentDto();
		//		std1.setId(4);
		//		std1.setName("Sah");
		//		std1.setEmail("Sahul@gmail.com");
		//		std1.setStream("cse");
		//		
		//		StudentDao dao = new StudentDao();
		//		
		//		dao.saveStudent(std);
		//		dao.saveStudent(std1);
		//	
		StudentDao st = new StudentDao();
		//	StudentDto student = st.fetchStudent(3);
		//    System.out.println(student);	


		//   StudentDto st1 = new StudentDto();
		//    st1.setId(1);
		//    st1.setName("room");
		//    st1.setEmail("AC=gmail.com");
		//    st1.setStream("cse");
		//    
		//    st.updateStudent(st1);
		//    
		st.deleteStudent(1);


	}

}
