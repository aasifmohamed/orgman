package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import org.junit.Test;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = new GenderFactory().buildGender("Male");
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertNotNull(gender);
        System.out.println("Gender: " +  gender.toString());

    }
}