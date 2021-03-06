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

package org.apache.hadoop.hive.metastore.events;

import org.apache.hadoop.hive.metastore.HiveMetaStore.HMSHandler;
import org.apache.hadoop.hive.metastore.api.Database;

public class PreAlterDatabaseEvent extends PreEventContext {

  private final Database oldDB, newDB;

  public PreAlterDatabaseEvent(Database oldDB, Database newDB, HMSHandler handler) {
    super (PreEventType.ALTER_DATABASE, handler);
    this.oldDB = oldDB;
    this.newDB = newDB;
  }

  /**
   * @return the old db
   */
  public Database getOldDatabase () {
    return oldDB;
  }

  /**
   * @return the new db
   */
  public Database getNewDatabase() {
    return newDB;
  }
}
