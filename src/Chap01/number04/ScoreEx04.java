package Chap01.number04;

public class ScoreEx04 {

    public static void main(String[] args) {
        //독립된 if 구문
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } 
        
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        } 
        
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }

    }
}
