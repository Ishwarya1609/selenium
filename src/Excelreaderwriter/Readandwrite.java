package Excelreaderwriter;

public class Readandwrite {

	public static void main(String[] args) {
		
		Xls_Reader wr=new Xls_Reader("./src/Excelfile/test.xlsx");
		
		String sname="class";
		
		int count =wr.getRowCount(sname);
		System.out.println(count);
		for(int i=2;i<=count;i++)
		{
			String nclass=wr.getCellData(sname, "Class", i);
			String nsection=wr.getCellData(sname, 1, i);
			System.out.println(nclass);
			System.out.println(nsection);
			wr.setCellData(sname, "Status", i, "pass");
		}
		
		
		

	}

}
