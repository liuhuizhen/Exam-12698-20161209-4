import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
				int sum = 0;
				int leap;
				System.out.print("请输入日期（格式为2016-1-1）\n");
				Scanner sc = new Scanner(System.in);
				String date=sc.next();
				String[] dates=date.split("-");
				int year=Integer.parseInt(dates[0]);
				int month=Integer.parseInt(dates[1]);
				int day=Integer.parseInt(dates[2]);

				switch (month) /* 先计算某月以前月份的总天数 */
				{
				case 12:sum+=30;
				case 11:sum+=31;
				case 10:sum+=30;
				case 9:sum+=31;
				case 8:sum+=31;
				case 7:sum+=30;
				case 6:sum+=31;
				case 5:sum+=30;
				case 4:sum+=31;
				case 3:sum+=28;
				case 2:sum+=31;
				}
				sum = sum + day; /* 再加上某天的天数 */
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))/* 判断是不是闰年 */
					leap = 1;
				else
					leap = 0;
				if (leap == 1 && month > 2)/* 如果是闰年且月份大于2,总天数应该加一天 */
					sum++;
				System.out.println("你输入的日期为当年的第" + sum+"天");
			}

}
