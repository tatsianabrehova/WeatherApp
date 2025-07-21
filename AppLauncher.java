import javax.swing.*;

public class AppLauncher {
public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run (){
            new WeatherApp().setVisible(true);
//System.out.println(App.getLocationData("Tokyo"));
            System.out.println(App.getCurrentTime());
        }
    });
}
}
