public class ConverterApplication {
    public static void main(String[] args) {

        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();

        String monthIf = converterIf.convertMonth(11);
        String dayIf = converterIf.convertDay(1);

        String monthSwitch = converterSwitch.convertMonth(4);
        String daySwitch = converterSwitch.convertDay(6);

        System.out.println("UsingConverterIf-input11: " + monthIf);
        System.out.println("UsingConverterIf-input1: " + dayIf);
        System.out.println("UsingConverterSwitch-input4: " + monthSwitch);
        System.out.println("UsingConverterSwitch-input6: " + daySwitch);

    }
}
