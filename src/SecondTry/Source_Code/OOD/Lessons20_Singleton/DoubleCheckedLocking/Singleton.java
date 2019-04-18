package SecondTry.Source_Code.OOD.Lessons20_Singleton.DoubleCheckedLocking;



class Singleton {
    private String value;
    private static volatile Singleton _instance;//volatile чтобы поле могло изменяться разными потоками и не кэшировалось

     Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static Singleton  getInstance( String context){
        if (_instance !=null)return _instance;
        else{
            synchronized (Singleton.class){//проверка условия блокировки потока без синхронизации. Дальше поток пытается получить блокировку
                if(_instance==null){       //если результат второй проверки говорит о том, что у другого потока блокировки нет
                    _instance =new Singleton(context);//уменьшаются расходы на ленивую инициализацию)

                }

            }
        }
        return _instance;
    }
}

