package com.fs2.storage.memory;

import com.fs2.api.AbstractAPITest;
import com.fs2.api.FS2Factory;
import com.fs2.api.FlexibleStorageSystem;

/**
 * Exercises the FS2 API using the in memory implementation
 * 
 * @author robert.christian
 */
public class MemoryAPITest extends AbstractAPITest {

  @Override
  protected FlexibleStorageSystem getFS2Instance() {
    return FS2Factory.newInstance("mem");
  }

}
