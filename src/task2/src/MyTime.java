public class MyTime {
        private int hour;
        private int minute;
        private int second;

        public MyTime() {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }

        public MyTime(int hour, int minute, int second) {
            setTime(hour, minute, second);
        }

        public void setTime(int hour, int minute, int second) {
            if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            } else {
                System.out.println("Yaroqsiz soat, daqiqa yoki soniya");
            }
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public void setHour(int hour) {
            if (hour >= 0 && hour < 24)
                this.hour = hour;
            else {
                System.out.println("Yaroqsiz soat");
            }
        }

        public void setMinute(int minute) {
            if (minute >= 0 && minute < 60)
                this.minute = minute;
            else {
                System.out.println("Yaroqsiz minut");
            }
        }

        public void setSecond(int second) {
            if (second >= 0 && second < 60)
                this.second = second;
            else {
                System.out.println("Yaroqsiz second");
            }
        }

        public String toString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }

        public MyTime nextSecond() {
            second++;
            if (second == 60) {
                second = 0;
                nextMinute();
            }
            return this;
        }

        public MyTime nextMinute() {
            minute++;
            if (minute == 60) {
                minute = 0;
                nextHour();
            }
            return this;
        }

        public MyTime nextHour() {
            hour++;
            if (hour == 24) {
                hour = 0;
            }
            return this;
        }

        public MyTime previousSecond() {
            second--;
            if (second == -1) {
                second = 59;
                previousMinute();
            }
            return this;
        }

        public MyTime previousMinute() {
            minute--;
            if (minute == -1) {
                minute = 59;
                previousHour();
            }
            return this;
        }

        public MyTime previousHour() {
            hour--;
            if (hour == -1) {
                hour = 23;
            }
            return this;
        }

        public static void main(String[] args) {
            MyTime myTime = new MyTime(0, 30, 25);
            System.out.println(myTime.toString());
            myTime.nextSecond();
            System.out.println(myTime.toString());
            myTime.nextMinute();
            System.out.println(myTime.toString());
            myTime.nextHour();
            System.out.println(myTime.toString());


        }
}