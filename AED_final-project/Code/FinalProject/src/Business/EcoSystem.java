package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.RegisterDonar.Donar;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization{

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Donar> donarList;
    private ArrayList<Deceased> deceasedList;
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem(){
        super(null);
        donarList = new ArrayList<Donar>();
        networkList = new ArrayList<>();
        deceasedList = new ArrayList<Deceased>();
    }

    public ArrayList<Deceased> getDeceasedList() {
        return deceasedList;
    }

    public void setDeceasedList(ArrayList<Deceased> deceasedList) {
        this.deceasedList = deceasedList;
    }
    
    public Donar addDonar()
    {
        Donar donar = new Donar();
        donarList.add(donar);
        return donar;
    }
    public Deceased addDeceased()
    {
        Deceased deceased = new Deceased();
        deceasedList.add(deceased);
        return deceased;
    }

    public ArrayList<Donar> getDonarList() {
        return donarList;
    }

    public void setDonarList(ArrayList<Donar> donarList) {
        this.donarList = donarList;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SysAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

}