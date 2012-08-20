package com.iary.dci.data.aggregate;

import java.io.Serializable;

/**
 * ΚµΜε
 * 
 * @author feiying.gh
 * 
 * @param <PK>
 */
public interface Entity<PK> extends Serializable {

	PK getId();

}
