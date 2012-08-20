package com.iary.dci.data.aggregate;

import java.io.Serializable;

public interface Entity<PK> extends Serializable {

	PK getId();

}
