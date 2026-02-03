package applePractice;

public class ContainerWithMostWater {
    static void main() {

        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height1 = {1,1};
        int i = maxArea(height);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        int leftPillar = 0;
        int rightPillar = height.length-1;
        int maxWater = 0;

        while (leftPillar<rightPillar){
            int width = rightPillar-leftPillar;
            int h = Math.min(height[leftPillar],height[rightPillar]);
            int currentWater = width * h;
            maxWater = Math.max(maxWater,currentWater);

            if (height[leftPillar] < height[rightPillar]){
                leftPillar++;
            }
            else {
                rightPillar--;
            }

        }

        return maxWater;
    }
}
