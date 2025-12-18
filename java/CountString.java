import java.util.Arrays;
class CountString{
    public static void main(String[] args) {
        String s = "hello world";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + String.valueOf(arr));
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < arr.length; i++) {
            int freq = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i] + ": " + freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = arr[i];
            }
        }
        System.out.println("Most frequent character: '" + maxChar + "' appearing " + maxFreq + " times.");
    }
}