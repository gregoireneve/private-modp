package be.gamery.pvpfac.proxy;

public class Clientproxy extends Commonproxy{
@Override 
public void registerRender() 
{
	System.out.println("Client launch side");
	System.out.println("you don't have permission to use the mods for your server");
}
}
