package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("1001", "212133640@mycput.ac.za","10");
        Assert.assertNotNull(userRole.getOrgCode());
        Assert.assertNotNull(userRole.getUserEmail());
        Assert.assertNotNull(userRole.getRoleId());
        Assert.assertNotNull(userRole);
        System.out.println("User Role: " +  userRole.toString());
    }
}