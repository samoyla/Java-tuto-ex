import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;

// public class CustomTimer extends TimerTask {
// 	private int time = 5;

// 		@Override
// 		public void run(){
// 			System.out.println("time : " + time);
// 			if(time == 5){
// 				System.out.println("Attention !!!");
// 			}
// 			if(time == 0){
// 				Random r = new Random();
// 				int alea = r.nextInt(6 - 1) + 1;
// 				System.out.println("the dice value is : " + alea);
// 				cancel();
// 			}
// 			time--;
// 		}
// 	}

public class CustomTimer {
	private Timer timer;

	private int timeInSec;

	public CustomTimer(){
		this.timer = new Timer();
		this.timeInSec = 10;
	}

	public void start(TimerListener listener){
		listener.onStart();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println(timeInSec + "s");
				listener.onRun();

				if(timeInSec == 0){
					System.out.println("Stop!");
					listener.onFinish();
					cancel();
				}
				timeInSec--;
			}
			
		}, 1000, 1000);
	}

}

