package by.raman.lessons;
/*
2. Дано температура по дням за неделю пн- 17, вт - 13, ср -10, чт-10, пт - 5, сб - 14, вск - 20:
- Найти среднюю температуру за неделю
- Найди минимальную температуру за неделю
- Найти максимальную температуру за неделю

 */
public class Array3 {
    public static void main(String[] args) {
        int [] temperatureWeek = {17,13,10,10,5,14,20};

        int maxTemperature = getMaxTemperature(temperatureWeek);

        int MinTemperature = getMinTemperature(temperatureWeek,maxTemperature);

        double avgTemperature = getAvgTemperature(temperatureWeek);

        print(maxTemperature,MinTemperature,avgTemperature);

    }

    public static int getMaxTemperature(int [] temperatureWeek){
        int maxValue = 0;
        for (int i = 0; i < temperatureWeek.length; i++) {
            if(temperatureWeek[i]>maxValue){
                maxValue=temperatureWeek[i];
            }
        }
        return  maxValue;
    }

    public static int getMinTemperature(int [] temperatureWeek, int MaxTemperature){
        int minValue = MaxTemperature;
        for (int i = 0; i < temperatureWeek.length; i++) {
            if(temperatureWeek[i]<minValue){
                minValue=temperatureWeek[i];
            }
        }
        return minValue;
    }

    public static double getAvgTemperature(int [] temperatureWeek){
        double avgValue = 0;
        for (int i = 0; i < temperatureWeek.length; i++) {
                avgValue+=temperatureWeek[i];
            }
                avgValue=avgValue/temperatureWeek.length;
        return avgValue;
        }

        public static void print(int maxTemperature,int MinTemperature, double avgTemperature ){
            System.out.println(maxTemperature +" -Максимальное значение Массива");
            System.out.println(MinTemperature + " -Минимальное значение Массива");
            System.out.println(avgTemperature + " -Усредненное значение Массива");
        }
}
