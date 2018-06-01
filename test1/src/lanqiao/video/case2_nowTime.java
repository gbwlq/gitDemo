package lanqiao.video;

public class case2_nowTime {
	public static void main(String[] args) {
		
		//调用系统函数
		long currentTimeMillis = System.currentTimeMillis();
		
		//总秒数
		long totalSeconds = currentTimeMillis/1000;
		//求秒数
		long seconds = totalSeconds%60;
		
		//总分数
		long totalMinutes = totalSeconds/60;
		//求分数
		long minutes = totalMinutes%60;
		
		//总时数
		long totalHours= totalMinutes/60;
		//求时数
		long hours= totalHours%24;
		System.out.println("现在是" + (hours +8)+ "时:" + minutes +"分:" + seconds +"秒");
	}

}
