package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory.AbstractFactory;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory.FactoryGenerator;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory.TeslaFactory;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.IProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.ITeslaProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.TeslaModelS;

public class Run {
    public static void main(String[] args) {
        AbstractFactory teslafactory= FactoryGenerator.getFactory("tesla");
        IProduct a= teslafactory.getTeslaProduct("teslaroadster");
        a.makeProduct();
    }
}
