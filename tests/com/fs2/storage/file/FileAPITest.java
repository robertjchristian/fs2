package com.fs2.storage.file;

import com.fs2.api.AbstractAPITest;
import com.fs2.api.FS2Configuration;
import com.fs2.api.FS2Factory;
import com.fs2.api.FlexibleStorageSystem;

/**
 * Exercises the FS2 API using the file implementation
 * 
 * @author robert.christian
 */
public class FileAPITest extends AbstractAPITest {

  @Override
  protected FlexibleStorageSystem getFS2Instance() {
    FS2Configuration config = new FS2DefaultFileConfig();
    return FS2Factory.newInstance(config);
  }

}
