interface IMusicPlayer
{
	void play();
	void pause();
}
interface ICamera
{
	void click();
	void Capture();
}
class Phone
{
	void call()
	{
		System.out.println("Calling");
	}
	void sms()
	{
		System.out.println("Texting");
	}
}
class SmartPhone extends Phone implements IMusicPlayer,ICamera
{
	void Vediocall()
	{
		System.out.println("VideoCalling");
	}
	public void click()
	{
		System.out.println("Cliking an image");
	}
	public void Capture()
	{
		System.out.println("Capturing");
	}
	public void play()
	{
		System.out.println("Playing music");
	}
	public void pause()
	{
		System.out.println("Pause");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s=new SmartPhone();
		s.call();
		s.Capture();
		s.click();
		s.pause();
		s.sms();
		s.Vediocall();
		s.play();
		

	}

}
