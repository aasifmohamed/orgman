package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDemo = UserDemographyFactory.buildUserDemography("212133640@mycput.ac.za", "Mr","1","4", new Date());
        Assert.assertNotNull(userDemo.getUserEmail());
        Assert.assertNotNull(userDemo.getUserTitle());
        Assert.assertNotNull(userDemo.getGenderId());
        Assert.assertNotNull(userDemo.getRaceId());
        Assert.assertNotNull(userDemo);
        System.out.println("User Demography: " +  userDemo.toString());

    }
}