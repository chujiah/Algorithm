import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridgeTrucks = new LinkedList<>(); // 다리 위 트럭 큐
        int time = 0; // 경과 시간
        int bridgeWeight = 0; // 현재 다리 위의 총 무게

        for (int i = 0; i < bridge_length; i++) {
            bridgeTrucks.add(0); // 다리를 초기화 (빈 트럭)
        }

        int index = 0; // 대기 중인 트럭의 인덱스

        while (index < truck_weights.length || bridgeWeight > 0) {
            time++;

            // 다리를 건넌 트럭 제거
            int departedTruck = bridgeTrucks.poll();
            bridgeWeight -= departedTruck;

            // 대기 트럭을 다리에 올릴 수 있는지 확인
            if (index < truck_weights.length && bridgeWeight + truck_weights[index] <= weight) {
                bridgeTrucks.add(truck_weights[index]); // 트럭 추가
                bridgeWeight += truck_weights[index];
                index++;
            } else {
                bridgeTrucks.add(0); // 대기 중이면 빈 공간 유지
            }
        }

        return time;
    }
}