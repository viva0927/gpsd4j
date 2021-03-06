/*
 * Copyright 2017 Ivaylo Stoyanov <me@ivkos.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivkos.gpsd4j.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class VersionMessage extends GpsdCommandMessage
{
   public static final String CLASS = "VERSION";

   /**
    * @return Public release level
    */
   @JsonProperty("release")
   private String release;

   /**
    * @return Internal revision-control level
    */
   @JsonProperty("rev")
   private String revision;

   /**
    * @return API major revision level
    */
   @JsonProperty("proto_major")
   private Integer protocolMajor;

   /**
    * @return API minor revision level
    */
   @JsonProperty("proto_minor")
   private Integer protocolMinor;

   @Override
   public String getGpsdClass()
   {
      return CLASS;
   }
}
