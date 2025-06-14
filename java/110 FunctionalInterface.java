package code;
@FunctionalInterface
interface Candidate {
    boolean isCandidate(int num);
}

public class Test {
    public static void main(String[] args) {
        Candidate candidate = num -> {
            if (num <= 1) return false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(candidate.isCandidate(12));
        System.out.println(candidate.isCandidate(13));
    }
}
