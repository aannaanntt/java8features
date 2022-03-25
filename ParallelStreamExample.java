package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	public static long checkPerformance(Supplier<Integer> suu,int times) {
		long startTime= System.currentTimeMillis();
		for(int i=0;i<times;i++) {
		suu.get();
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime-startTime;
		
	}
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 1000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 1000).parallel().sum();
	}

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(checkPerformance(ParallelStreamExample::sumSequentialStream,20));
		System.out.println(checkPerformance(ParallelStreamExample::sumParallelStream,20));
//
//		System.out.println("parallel" + " " + sumParallelStream());
	}

}
