package javalibs5026211011;

import javax.swing.JOptionPane;

public class JavaLibs5026211011 {
    
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,
               "Welcome ! Please fill up every question correctly",
               "Get to Know You Games",
               1);
       
        String inputName = (String) JOptionPane.showInputDialog (null,
               "Who's your name?",
               "Get to Know You Games",
               3,
               null,
               null,
               "Type your name here!");
        
        String inputTown = (String) JOptionPane.showInputDialog (null,
                "Where do you live?",
                "Get to Know You Games",
                3,
                null,
                null,
                "Insert Here!");
        
        String inputAge = (String) JOptionPane.showInputDialog (null,
                "What year does you born?",
                "Get to Know You Games",
                3,
                null,
                null,
                "YYYY");
        
        int inputAge2 = Integer.parseInt(inputAge);
        int ageOutput = 2022 - inputAge2;
        
        String inputBornday = (String) JOptionPane.showInputDialog(null,
                "What is your bornday",
                "Get to Know You Games",
                3,
                null,
                null,
                "Input bornday here!");
        
        String inputHeight = (String) JOptionPane.showInputDialog(null,
                "How tall are you in metres",
                "Get to Know You Games",
                3,
                null,
                null,
                "Input height here in double format!");
        
        double inputHeight2 = Double.parseDouble(inputHeight);
        double standartWeight = inputHeight2 - 100;
        
        String inputWeight = (String) JOptionPane.showInputDialog(null,
                "How much do you weight?",
                "Get to Know You Gamse",
                3,
                null,
                null,
                "Input weight here!");
        
        int inputWeight2 = Integer.parseInt(inputWeight);
        
        String inputSport = (String) JOptionPane.showInputDialog(null,
                "What kind of sport did you like?",
                "Get to Know You Games",
                3,
                null,
                null,
                "Insert your favorite sport here!");
        
        String inputHobby = (String) JOptionPane.showInputDialog (null,
                "What is your hobby?",
                "Get to Know You Games",
                3,
                null,
                null,
                "Insert your hobby here!");
        
        JOptionPane.showMessageDialog (null,
                "Hello, " + inputName + " from "+ inputTown + "." + " How's youre day?, hope all doing good. " + "\n" +
                "This year was you're " + ageOutput + " " + inputBornday + "." + "\n"
        + "Because of pandemic we are all agree that healthy is a must, simply we can take a look at our height and weight to know our body situation." + " Your height was " + inputHeight2 +
        " and your weight was " + inputWeight2 + " while your ideal weight is " + standartWeight + " kilogram" + "." + "\n" +
        "You can keep your body healthy by doing some sports like jogging or your favorite sport "
        + inputSport + "." + " You can also doing your hobby " + inputHobby + " as your happiness to keep your mind clear." + "\n" 
        + " That's all, hope you all stay healthy in this pandemic, good bye!",
                "Get to Know You Games",
                1);
    }
}
