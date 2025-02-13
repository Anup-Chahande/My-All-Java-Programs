package Multimedia;

public class VideoFile extends MultimediaFile{
	String resolution;
	String subtitels;
	
	void resolutionandsubtitle(String resolution,String subtitels){
		this.resolution=resolution;
		this.subtitels=subtitels;
		
		
	}
	 void play() {
		 
		 System.out.println("Video resolution is = " + resolution +" | Song Lyrics is = " + subtitels );
	 }
	
	
	public static void main(String[] args) {
		VideoFile vid1=new VideoFile();
		VideoFile vid2=new VideoFile();

		vid1.resolutionandsubtitle("1080p", " You are perfrect for me.... ");
		vid2.resolutionandsubtitle("1080p", "Blow kiss fire a gun ..... ");
        vid1.play();
        vid2.play();

	}
	

}
