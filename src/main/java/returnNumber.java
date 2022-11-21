public class returnNumber {
        String[] str;
        public returnNumber(String[] str) {
            this.str = str;
        }
        public int ret() {
        for (int i = 0; i <= str.length;i++) {
            int y = Integer.parseInt(str[i]);
            return y;
        }
            return 0;
        }
}