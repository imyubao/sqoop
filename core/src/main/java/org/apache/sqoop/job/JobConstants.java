/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.job;

import org.apache.sqoop.core.ConfigurationConstants;

public final class JobConstants extends Constants {

  /**
   * All job related configuration is prefixed with this:
   * <tt>org.apache.sqoop.job.</tt>
   */
  public static final String PREFIX_JOB_CONFIG =
      ConfigurationConstants.PREFIX_GLOBAL_CONFIG + "job.";


  public static final String JOB_ETL_PARTITIONER = PREFIX_JOB_CONFIG
      + "etl.partitioner";

  public static final String JOB_ETL_EXTRACTOR = PREFIX_JOB_CONFIG
      + "etl.extractor";

  public static final String JOB_ETL_LOADER = PREFIX_JOB_CONFIG
      + "etl.loader";


  public static final String JOB_MR_OUTPUT_FILE = PREFIX_JOB_CONFIG
      + "mr.output.file";

  public static final String JOB_MR_OUTPUT_CODEC = PREFIX_JOB_CONFIG
      + "mr.output.codec";


  private JobConstants() {
    // Disable explicit object creation
  }
}