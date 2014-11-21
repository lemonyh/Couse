package cn.yuhao.test04;

import org.junit.Test;

public class Test_ArrayReturn {
	String[] initArray1() {
		String data1[] = { "余昊", "高瑞", "曹玉思" };
		return data1;
	}

	String[][] initArray2() {
		String data2[][] = { 
				{ "余昊", "高瑞", "曹玉思" }, { "aa", "bb", "cc" },
				{ "jj", "kk", "dd" },
				};

		return data2;
	}
	public void print(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	public void print(String[][] str)
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.print("{");
			for(int j=0;j<str[i].length;j++)
			{
				
				System.out.print(str[i][j]+" ,");
				
			}
			System.out.println("}");
		}
	}
	@Test
	public void test01()
	{
		Test_ArrayReturn testArrayReturn=new Test_ArrayReturn();
		testArrayReturn.print(initArray1());
		testArrayReturn.print(initArray2());
	}
}
