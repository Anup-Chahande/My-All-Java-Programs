package Multimedia;

public class MultimediaFile {
String Title;
double duration;
String filesize;


void Songs(String Title,double duration,String filesize) {
	
	this.Title=Title;
	this.duration=duration;
	this.filesize=filesize;
	
	
	
	
	
}

 void play() {
	 
	 System.out.println("Song name is = " + Title +" | Song Duration = " + duration + " | Filesize is = " + filesize);
 }
 

public static void main(String[] args) {
	MultimediaFile music1=new MultimediaFile();
	MultimediaFile music2=new MultimediaFile();

	music1.Songs("Perfect", 3.24,"3MB" );
	music2.Songs("Lean on", 4.24,"6MB" );
	music1.play();
	music2.play();

}



}