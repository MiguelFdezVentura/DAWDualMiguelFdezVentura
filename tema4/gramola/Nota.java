package tema4.gramola;

import javax.sound.sampled.*;

public class Nota {
	
	public static float SAMPLE_RATE = 8000f;
	
	public static void suena(int hz, int msecs) throws LineUnavailableException{
		suena(hz, msecs, 1.0);
	}
	
	public static void suena(int hz, int msecs, double vol) throws LineUnavailableException {
		byte[] buf = new byte[1];
		AudioFormat af = new AudioFormat(SAMPLE_RATE,
				8, //sampleSizeInBits
				1, //channels
				true,
				false);
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		for(int i=0; i < msecs * 8; i++) {
			double angle = i/(SAMPLE_RATE/hz) * 2.0 * Math.PI;
			buf[0] = (byte) (Math.sin(angle) * 127.0 * vol );
			sdl.write(buf, 0, 1);
		}
		sdl.drain();
		sdl.stop();
		sdl.close();
	}
	
}
