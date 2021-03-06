/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeGlobalConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Integer httpStatusCode;

	private GlobalConfig globalConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public GlobalConfig getGlobalConfig() {
		return this.globalConfig;
	}

	public void setGlobalConfig(GlobalConfig globalConfig) {
		this.globalConfig = globalConfig;
	}

	public static class GlobalConfig {

		private Integer maxConcurrencyPerAgent;

		public Integer getMaxConcurrencyPerAgent() {
			return this.maxConcurrencyPerAgent;
		}

		public void setMaxConcurrencyPerAgent(Integer maxConcurrencyPerAgent) {
			this.maxConcurrencyPerAgent = maxConcurrencyPerAgent;
		}
	}

	@Override
	public DescribeGlobalConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
