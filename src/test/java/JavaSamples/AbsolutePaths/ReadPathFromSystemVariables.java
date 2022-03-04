package JavaSamples.AbsolutePaths;

public class ReadPathFromSystemVariables {
    public static void main(String[] args) {
        String homeDirNodes = System.getenv("NODE_PATH")+"\\node.exe";
        String homeDirAppium = System.getenv("APPIUM_PATH");
       // NODE_PATH
        System.out.println("Node Path is "+homeDirNodes+"");
        // Appium PATH
        System.out.println("Appium Path is "+homeDirAppium+"");
    }
}
