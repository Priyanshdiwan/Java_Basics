import java.util.Random;

class RandomNumberThread extends Thread {
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("Generated Number is " + randomInteger);
			if((randomInteger%2) == 0) {
				SquareThread sThread = new SquareThread(randomInteger);
				sThread.start();
			}
			else {
				CubeThread cThread = new CubeThread(randomInteger);
				cThread.start();
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

class SquareThread extends Thread {
	int number;

	SquareThread(int randomNumbern) {
		number = randomNumbern;
	}

	public void run() {
		System.out.println("The Thread " + number + " is even and square of "+ number +" is " + (number * number));
        System.out.println("-----------------------------------------------");
	}
}

class CubeThread extends Thread {
	int number;

	CubeThread(int randomNumber) {
		number = randomNumber;
	}

	public void run() {
		System.out.println("The Thread " + number + " is odd and cube of "+ number +" is " + number * number * number);
        System.out.println("-----------------------------------------------");
	}
}

public class Multi_threadss {
	public static void main(String args[]) {
		RandomNumberThread rnThread = new RandomNumberThread();
		rnThread.start();
	}
}