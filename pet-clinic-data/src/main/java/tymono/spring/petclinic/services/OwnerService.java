package tymono.spring.petclinic.services;

import tymono.spring.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
