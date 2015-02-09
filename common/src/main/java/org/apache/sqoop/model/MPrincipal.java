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
package org.apache.sqoop.model;

/**
 * Model describing entire principal object which used in principal based authorization controller
 */
public class MPrincipal {

  private final String name;
  /**
   * Currently, the type supports user, group and role.
   */
  private final String type;

  /**
   * Default constructor to build  new MPrincipal model.
   *
   * @param name Principal name
   * @param type Principal type
   */
  public MPrincipal(String name,
                    String type) {
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Principal (");
    sb.append("Principal name: ").append(this.name);
    sb.append(", Principal type: ").append(this.type);
    sb.append(" )");

    return sb.toString();
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }
}
