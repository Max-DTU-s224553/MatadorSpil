public class Die {
    private int maxFaceValue = 6;
    private int faceValue;

    int roll(){
        faceValue = (int)(Math.random() * maxFaceValue) + 1;
        return faceValue;
    }

    int getFaceValue(){
        return faceValue;
    }
}
