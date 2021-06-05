package javaKamp.hrms.adapters.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import javaKamp.hrms.adapters.abstracts.UserCheckService;
import javaKamp.hrms.core.utilities.results.ErrorResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.IndividualUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements UserCheckService{

	@Override
	public  Result checkIfRealPerson(IndividualUser individualUser) {
		KPSPublicSoap mernisClient = new KPSPublicSoapProxy();
		try {
			return new Result( mernisClient.TCKimlikNoDogrula(
					Long.parseLong(individualUser.getNationalityNumber()),
					individualUser.getFirstName(),
					individualUser.getLastName(),
					individualUser.getDateOfBirth().getYear()), "Gerçek Kişi");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ErrorResult("Gerçek Olmayan Kişi");
	}

}
