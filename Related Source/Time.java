import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Time
{
	public static void main(String args[])
	{
		TimeZone tz;
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분(a)");

		// 아시아
		
		tz = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz);
		System.out.println("한국");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Tokyo");
		df.setTimeZone(tz);
		System.out.println("일본");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Shanghai");
		df.setTimeZone(tz);
		System.out.println("중국");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Jakarta");
		df.setTimeZone(tz);
		System.out.println("인도네시아");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Riyadh");
		df.setTimeZone(tz);
		System.out.println("사우디아라비아");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Tehran");
		df.setTimeZone(tz);
		System.out.println("이란");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Baghdad");
		df.setTimeZone(tz);
		System.out.println("아랍");
		System.out.println(df.format(date));
		System.out.println();

		tz = TimeZone.getTimeZone("Asia/Ulan_Bator");
		df.setTimeZone(tz);
		System.out.println("몽골");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Kathmandu");
		df.setTimeZone(tz);
		System.out.println("네팔");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Singapore");
		df.setTimeZone(tz);
		System.out.println("싱가포르");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Bangkok");
		df.setTimeZone(tz);
		System.out.println("태국");
		System.out.println(df.format(date));
		System.out.println();
		
		// 유럽
		
		tz = TimeZone.getTimeZone("Europe/London");
		df.setTimeZone(tz);
		System.out.println("영국");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Dublin");
		df.setTimeZone(tz);
		System.out.println("아일랜드");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Paris");
		df.setTimeZone(tz);
		System.out.println("프랑스");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Berlin");
		df.setTimeZone(tz);
		System.out.println("독일");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Amsterdam");
		df.setTimeZone(tz);
		System.out.println("네덜란드");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Rome");
		df.setTimeZone(tz);
		System.out.println("이탈리아");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Lisbon");
		df.setTimeZone(tz);
		System.out.println("포르투갈");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Madrid");
		df.setTimeZone(tz);
		System.out.println("스페인");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Copenhagen");
		df.setTimeZone(tz);
		System.out.println("덴마크");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Oslo");
		df.setTimeZone(tz);
		System.out.println("노르웨이");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Stockholm");
		df.setTimeZone(tz);
		System.out.println("스웨덴");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Warsaw");
		df.setTimeZone(tz);
		System.out.println("폴란드");
		System.out.println(df.format(date));
		System.out.println();
		
		// 아메리카
		
		tz = TimeZone.getTimeZone("America/Brasilia");
		df.setTimeZone(tz);
		System.out.println("브라질");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Argentina/Buenos_Aires");
		df.setTimeZone(tz);
		System.out.println("아르헨티나");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Lima");
		df.setTimeZone(tz);
		System.out.println("페루");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Santiago");
		df.setTimeZone(tz);
		System.out.println("칠레");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Caracas");
		df.setTimeZone(tz);
		System.out.println("베네수엘라");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Los_Angeles");
		df.setTimeZone(tz);
		System.out.println("미국");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("America/Mexico_City");
		df.setTimeZone(tz);
		System.out.println("멕시코");
		System.out.println(df.format(date));
		System.out.println();
		
		tz = TimeZone.getTimeZone("Canada/Saskatchewan");
		df.setTimeZone(tz);
		System.out.println("캐나다");
		System.out.println(df.format(date));
		System.out.println();
	}
}