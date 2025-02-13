package Multimedia;

public class AudioFile extends MultimediaFile {

	String Artist;
	String Album;
	
	void artistalbum(String Artist,String Album){
		this.Artist=Artist;
		this.Album=Album;
		
		
		
	}
	void play() {
		 
		 System.out.println("Song Artist is = " + Artist +" | Song Album = " + Album );
	 }
	public static void main(String[] args) {
		AudioFile audio1=new AudioFile();
		AudioFile audio2=new AudioFile();

		audio1.artistalbum("Ed Sheeran", "david");
		audio2.artistalbum("DJ snake", "Peace is Mission");
		audio1.play();
		audio2.play();

	}
}
