package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser("1001", "212133640@mycput.ac.za");
        Assert.assertNotNull(orgUser.getOrgCode());
        Assert.assertNotNull(orgUser.getUserEmail());
        Assert.assertNotNull(orgUser);
        System.out.println("Organisation User: " +  orgUser.toString());

    }
}