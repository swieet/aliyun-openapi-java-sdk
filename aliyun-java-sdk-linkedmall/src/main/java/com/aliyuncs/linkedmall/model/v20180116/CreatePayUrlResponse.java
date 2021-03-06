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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.CreatePayUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePayUrlResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private String message;

	private Model model;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String redirectUrl;

		private List<String> orderIds;

		private List<String> payTradeIds;

		private List<String> lmOrderList;

		public String getRedirectUrl() {
			return this.redirectUrl;
		}

		public void setRedirectUrl(String redirectUrl) {
			this.redirectUrl = redirectUrl;
		}

		public List<String> getOrderIds() {
			return this.orderIds;
		}

		public void setOrderIds(List<String> orderIds) {
			this.orderIds = orderIds;
		}

		public List<String> getPayTradeIds() {
			return this.payTradeIds;
		}

		public void setPayTradeIds(List<String> payTradeIds) {
			this.payTradeIds = payTradeIds;
		}

		public List<String> getLmOrderList() {
			return this.lmOrderList;
		}

		public void setLmOrderList(List<String> lmOrderList) {
			this.lmOrderList = lmOrderList;
		}
	}

	@Override
	public CreatePayUrlResponse getInstance(UnmarshallerContext context) {
		return	CreatePayUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
