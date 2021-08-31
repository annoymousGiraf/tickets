package dto.test.data

val allTickets = """
    [
      {
        "_id": "436bf9b0-1147-4c0a-8439-6f79833bff5b",
        "created_at": "2016-04-28T11:19:34-10:00",
        "type": "incident",
        "subject": "A Catastrophe in Korea (North)",
        "assignee_id": 24,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "1a227508-9f39-427c-8f57-1b72f3fab87c",
        "created_at": "2016-04-14T08:32:31-10:00",
        "type": "incident",
        "subject": "A Catastrophe in Micronesia",
        "assignee_id": 38,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "2217c7dc-7371-4401-8738-0a8a8aedc08d",
        "created_at": "2016-07-16T12:05:12-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Hungary",
        "assignee_id": 65,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "87db32c5-76a3-4069-954c-7d59c6c21de0",
        "created_at": "2016-07-06T11:16:50-10:00",
        "type": "problem",
        "subject": "A Problem in Morocco",
        "assignee_id": 7,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "4cce7415-ef12-42b6-b7b5-fb00e24f9cc1",
        "created_at": "2016-02-25T09:12:47-11:00",
        "type": "question",
        "subject": "A Nuisance in Ghana",
        "assignee_id": 48,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "95870a6c-22bd-45c3-8d8e-b7f2c7d46b76",
        "created_at": "2016-06-26T12:12:53-10:00",
        "type": "question",
        "subject": "A Nuisance in Equatorial Guinea",
        "assignee_id": 3,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "81bdd837-e955-4aa4-a971-ef1e3b373c6d",
        "created_at": "2016-01-13T05:42:04-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Pakistan",
        "assignee_id": 40,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "5aa53572-b31c-4d27-814b-11709ab00259",
        "created_at": "2016-02-11T04:46:29-11:00",
        "type": "question",
        "subject": "A Problem in Heard and McDonald Islands",
        "assignee_id": 44,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "674a19a1-c330-45fb-8b61-b4d77ba87130",
        "created_at": "2016-03-07T08:24:53-11:00",
        "type": "task",
        "subject": "A Drama in St. Pierre and Miquelon",
        "assignee_id": 14,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "c73a0be5-e967-4948-b0a4-eff98d1a43ad",
        "created_at": "2016-06-12T09:32:30-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Maldives",
        "assignee_id": 34,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "b4875dbc-c167-4625-a1e4-d14ed409c62c",
        "created_at": "2016-04-22T12:55:29-10:00",
        "type": "question",
        "subject": "A Problem in Tonga",
        "assignee_id": 31,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "c08537d2-116d-45ff-a6d0-60c1a7d4778f",
        "created_at": "2016-05-15T01:23:37-10:00",
        "type": "task",
        "subject": "A Drama in British Indian Ocean Territory",
        "assignee_id": 64,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "9a21f37a-8ac5-4ef1-8b99-f1d4ca9cf170",
        "created_at": "2016-02-05T10:36:14-11:00",
        "type": "task",
        "subject": "A Problem in Turkey",
        "assignee_id": 18,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "35d6bb75-10fd-4ce8-8688-dde2882b623f",
        "created_at": "2016-02-02T12:58:47-11:00",
        "type": "question",
        "subject": "A Problem in St. Helena",
        "assignee_id": 65,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "6aac0369-a7e5-4417-8b50-92528ef485d3",
        "created_at": "2016-06-15T12:03:55-10:00",
        "type": "question",
        "subject": "A Nuisance in Latvia",
        "assignee_id": 29,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "4e85e18c-797a-4d28-8e92-750447d3b4f5",
        "created_at": "2016-02-04T07:50:34-11:00",
        "type": "task",
        "subject": "A Nuisance in Nicaragua",
        "assignee_id": 64,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "ded8a85b-3d18-4b21-ad77-e7ded3d09dcf",
        "created_at": "2016-04-23T11:14:42-10:00",
        "type": "question",
        "subject": "A Drama in Uruguay",
        "assignee_id": 68,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "fc5a8a70-3814-4b17-a6e9-583936fca909",
        "created_at": "2016-07-08T07:57:15-10:00",
        "type": "problem",
        "subject": "A Nuisance in Kiribati",
        "assignee_id": 19,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "b539a7db-1166-4537-9a5e-d2a97dd432bd",
        "created_at": "2016-01-16T09:56:03-11:00",
        "type": "task",
        "subject": "A Catastrophe in Lesotho",
        "assignee_id": 37,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "25c518a8-4bd9-435a-9442-db4202ec1da4",
        "created_at": "2016-01-11T08:56:20-11:00",
        "type": "problem",
        "subject": "A Drama in Iraq",
        "assignee_id": 72,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "d0f5ea36-a319-4c6d-a831-32b9a2b4a010",
        "created_at": "2016-03-13T03:32:53-11:00",
        "type": "problem",
        "subject": "A Problem in United Kingdom",
        "assignee_id": 7,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "9cbbadfe-7242-4d5a-af78-62aa7191d944",
        "created_at": "2016-01-30T12:45:37-11:00",
        "type": "task",
        "subject": "A Nuisance in Bangladesh",
        "assignee_id": 64,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "3584e2c9-ccd4-4acb-9419-9245891cf398",
        "created_at": "2016-04-18T11:55:49-10:00",
        "type": "question",
        "subject": "A Catastrophe in Azerbaijan",
        "assignee_id": 47,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "5507c3f7-27fe-48f1-b01e-46d31715cc62",
        "created_at": "2016-01-22T02:20:40-11:00",
        "type": "question",
        "subject": "A Problem in French Guiana",
        "assignee_id": 53,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "6f2eca87-8425-40f5-b12c-6745039d12f6",
        "created_at": "2016-01-15T04:28:01-11:00",
        "type": "question",
        "subject": "A Problem in Zaire",
        "assignee_id": 33,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "e68d8bfd-9826-42fd-9692-add445aa7430",
        "created_at": "2016-06-30T06:59:04-10:00",
        "type": "question",
        "subject": "A Catastrophe in Falkland Islands (Malvinas)",
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "be0f613a-e7f7-4833-9342-643b0d9b9fca",
        "created_at": "2016-03-13T10:19:40-11:00",
        "type": "problem",
        "subject": "A Drama in Cayman Islands",
        "assignee_id": 65,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "f3cc4dc6-3517-474b-b212-b82fdaa0800d",
        "created_at": "2016-02-04T04:52:04-11:00",
        "type": "task",
        "subject": "A Catastrophe in Laos",
        "assignee_id": 35,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "3d0d0ce2-6d1b-4f8d-a743-3863aeb29aab",
        "created_at": "2016-06-07T12:05:31-10:00",
        "type": "task",
        "subject": "A Problem in Pitcairn",
        "assignee_id": 64,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "b07a8c20-2ee5-493b-9ebf-f6321b95966e",
        "created_at": "2016-03-21T11:18:13-11:00",
        "type": "question",
        "subject": "A Drama in Portugal",
        "assignee_id": 17,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "25d9edca-7756-4d28-8fdd-f16f1532f6ab",
        "created_at": "2016-03-01T05:58:09-11:00",
        "type": "task",
        "subject": "A Problem in Cyprus",
        "assignee_id": 75,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "c68cb7d7-b517-4d0b-a826-9605423e78c2",
        "created_at": "2016-03-09T01:39:48-11:00",
        "type": "task",
        "subject": "A Problem in Western Sahara",
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "bb6b2b5b-d58e-4c05-99a8-0d7cf2792acb",
        "created_at": "2016-02-08T05:30:09-11:00",
        "type": "incident",
        "subject": "A Catastrophe in Cook Islands",
        "assignee_id": 69,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "dd2ed540-0720-4f2b-bb76-dbcb2c0ca25b",
        "created_at": "2016-07-06T06:49:31-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Benin",
        "assignee_id": 35,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "d318011c-5325-4d48-9766-953fd16a44a7",
        "created_at": "2016-04-17T04:24:39-10:00",
        "type": "problem",
        "subject": "A Problem in Norway",
        "assignee_id": 44,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "35072cd7-e343-4d8e-a967-bbe32eb019cb",
        "created_at": "2016-04-07T05:09:10-10:00",
        "type": "task",
        "subject": "A Catastrophe in Macau",
        "assignee_id": 12,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "01731a8f-7c00-40ca-94a1-6b874abd1d17",
        "created_at": "2016-03-13T02:28:57-11:00",
        "type": "incident",
        "subject": "A Nuisance in Egypt",
        "assignee_id": 36,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "530bc434-9984-4a54-8a74-83433d3da340",
        "created_at": "2016-05-17T09:06:05-10:00",
        "type": "incident",
        "subject": "A Problem in Denmark",
        "assignee_id": 22,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "1bdad283-b751-407d-a6d5-8067016b8010",
        "created_at": "2016-03-10T03:09:54-11:00",
        "type": "problem",
        "subject": "A Drama in Cocos (Keeling Islands)",
        "assignee_id": 35,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "a0d5a779-dc8d-4191-9245-971ed57a8072",
        "created_at": "2016-04-20T09:40:14-10:00",
        "type": "incident",
        "subject": "A Catastrophe in Italy",
        "assignee_id": 74,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "2614576f-98fb-4031-9e13-beca7a6a73ee",
        "created_at": "2016-07-17T10:18:00-10:00",
        "type": "question",
        "subject": "A Nuisance in Aruba",
        "assignee_id": 53,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "17951590-6a78-49e8-8e45-1d4326ba49cc",
        "created_at": "2016-06-28T03:29:34-10:00",
        "type": "incident",
        "subject": "A Nuisance in Kenya",
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "62a4326f-7114-499f-9adc-a14e99a7ffb4",
        "created_at": "2016-07-14T05:53:16-10:00",
        "type": "task",
        "subject": "A Drama in Wallis and Futuna Islands",
        "assignee_id": 57,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "b776f78f-e3ac-4139-9a8f-6f905472f44d",
        "created_at": "2016-03-27T04:49:07-11:00",
        "type": "task",
        "subject": "A Nuisance in Virgin Islands (US)",
        "assignee_id": 73,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "25cb699f-a5dd-45d8-9bc1-9c4b7d096946",
        "created_at": "2016-04-03T04:05:26-10:00",
        "type": "problem",
        "subject": "A Problem in Syria",
        "assignee_id": 48,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "4b88dee7-0c17-4fe2-8cb6-914b7ce93dc3",
        "created_at": "2016-05-06T04:13:09-10:00",
        "type": "question",
        "subject": "A Drama in East Timor",
        "assignee_id": 22,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "60d6b68c-51e9-439f-aacb-c2f36f1fa2f5",
        "created_at": "2016-07-25T06:11:54-10:00",
        "type": "incident",
        "subject": "A Catastrophe in Guam",
        "assignee_id": 15,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "01e60325-abe4-44d8-a821-035e15637428",
        "created_at": "2016-06-05T08:59:38-10:00",
        "type": "task",
        "subject": "A Catastrophe in Korea (South)",
        "assignee_id": 15,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "1c17f9a3-9ff2-4974-ae34-01959dbf64c6",
        "created_at": "2016-03-06T06:31:39-11:00",
        "type": "incident",
        "subject": "A Catastrophe in Jamaica",
        "assignee_id": 9,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "cb3b726e-9ba0-4e35-b4d6-ee41c29a7185",
        "created_at": "2016-05-03T02:44:43-10:00",
        "type": "incident",
        "subject": "A Problem in Mozambique",
        "assignee_id": 32,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "bbcb11e8-efa1-48e7-b06a-da9cf54afe69",
        "created_at": "2016-06-23T03:28:52-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Christmas Island",
        "assignee_id": 70,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "31ec2df9-edaf-496e-b05a-ca6a75ddcc67",
        "created_at": "2016-01-31T08:42:51-11:00",
        "type": "question",
        "subject": "A Drama in Georgia",
        "assignee_id": 31,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "a0bed386-ecd2-43fc-ae39-c8468d0e5cb4",
        "created_at": "2016-03-10T11:44:22-11:00",
        "type": "question",
        "subject": "A Drama in Samoa",
        "assignee_id": 40,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "8dc38ac1-53a6-4dff-a43d-d52aa9de1d1f",
        "created_at": "2016-02-13T01:35:11-11:00",
        "type": "incident",
        "subject": "A Nuisance in Greece",
        "assignee_id": 67,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "e33110bb-fd7b-4983-987a-4172a9e24919",
        "created_at": "2016-03-14T01:50:07-11:00",
        "type": "problem",
        "subject": "A Catastrophe in US Minor Outlying Islands",
        "assignee_id": 49,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "0e74f193-cd11-4803-93e1-807eb0e37874",
        "created_at": "2016-02-26T03:42:42-11:00",
        "type": "task",
        "subject": "A Drama in Venezuela",
        "assignee_id": 32,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "365c7ac9-b1d5-4bc9-91de-758f3d4b380a",
        "created_at": "2016-03-02T09:01:19-11:00",
        "type": "question",
        "subject": "A Problem in Dominican Republic",
        "assignee_id": 6,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "2e60886f-789f-4a00-8b43-e913facb6d78",
        "created_at": "2016-06-23T02:45:10-10:00",
        "type": "task",
        "subject": "A Catastrophe in Djibouti",
        "assignee_id": 56,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "8629d5fa-89c4-4e9b-9d9f-221b68b079f4",
        "created_at": "2016-02-03T03:44:33-11:00",
        "subject": "A Drama in Indonesia",
        "assignee_id": 68,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "6d6dbb5b-2b74-46a9-8e0a-8d8140f63412",
        "created_at": "2016-07-27T01:43:49-10:00",
        "type": "task",
        "subject": "A Nuisance in Comoros",
        "assignee_id": 73,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "b2a40bfd-b8f5-4e00-b352-dd374ee6180c",
        "created_at": "2016-04-17T02:20:54-10:00",
        "type": "task",
        "subject": "A Nuisance in Anguilla",
        "assignee_id": 36,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "54f60187-6064-492a-9a4c-37fc21b4e300",
        "created_at": "2016-02-11T05:36:16-11:00",
        "type": "problem",
        "subject": "A Problem in Barbados",
        "assignee_id": 20,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "027e95b2-f8de-43a8-86b0-c688525b3612",
        "created_at": "2016-01-22T06:11:01-11:00",
        "type": "task",
        "subject": "A Problem in Finland",
        "assignee_id": 14,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "a28d5e97-ab21-44ef-b4c4-95105a75e184",
        "created_at": "2016-03-30T09:18:00-11:00",
        "type": "question",
        "subject": "A Nuisance in Chile",
        "assignee_id": 52,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "49a3526c-2bc4-45b0-a6dd-6a55e5a4bd9f",
        "created_at": "2016-02-20T02:55:51-11:00",
        "subject": "A Drama in India",
        "assignee_id": 41,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "3d3fc420-7b04-47a7-ab94-870702a0ac14",
        "created_at": "2016-05-09T03:48:10-10:00",
        "type": "task",
        "subject": "A Catastrophe in Swaziland",
        "assignee_id": 43,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "b2035bdc-2ff4-4d23-9752-c5b67541193e",
        "created_at": "2016-06-26T01:12:46-10:00",
        "type": "question",
        "subject": "A Nuisance in Romania",
        "assignee_id": 25,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "3d4d1a3d-b426-4e0e-a50f-3c709d32a29f",
        "created_at": "2016-01-28T04:24:27-11:00",
        "type": "question",
        "subject": "A Nuisance in Niue",
        "assignee_id": 56,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "41fdfa9b-26c8-4d71-80ff-ad2220d0ad80",
        "created_at": "2016-03-09T10:57:14-11:00",
        "type": "incident",
        "subject": "A Nuisance in Yemen",
        "assignee_id": 48,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "916aab4a-0577-40cf-8f56-a45912a6ac23",
        "created_at": "2016-05-14T11:36:47-10:00",
        "type": "task",
        "subject": "A Nuisance in Togo",
        "assignee_id": 39,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "daf8d797-3d09-4c93-9f3b-a642b63ded99",
        "created_at": "2016-03-19T09:00:31-11:00",
        "type": "question",
        "subject": "A Catastrophe in San Marino",
        "assignee_id": 50,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "4271c15f-ade8-45b0-a31d-63cfee61adbf",
        "created_at": "2016-01-05T08:25:02-11:00",
        "type": "problem",
        "subject": "A Drama in Somalia",
        "assignee_id": 40,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "20615fe1-765b-4ff5-b4f6-ea42dcc8cac3",
        "created_at": "2016-03-25T05:33:29-11:00",
        "type": "task",
        "subject": "A Problem in Gambia",
        "assignee_id": 43,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "3ff0599a-fe0f-4f8f-ac31-e2636843bcea",
        "created_at": "2016-05-15T12:59:16-10:00",
        "type": "question",
        "subject": "A Problem in Antigua and Barbuda",
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "7c67b6ed-6776-4065-bd4a-f2d9d12c33b7",
        "created_at": "2016-07-03T03:05:56-10:00",
        "type": "problem",
        "subject": "A Nuisance in Greenland",
        "assignee_id": 59,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "c22aaced-7faa-4b5c-99e5-1a209500ff16",
        "created_at": "2016-07-11T08:52:25-10:00",
        "type": "incident",
        "subject": "A Problem in Ethiopia",
        "assignee_id": 55,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "c496e355-4400-4baa-b8ca-bb2edd270c43",
        "created_at": "2016-02-26T06:45:12-11:00",
        "type": "incident",
        "subject": "A Catastrophe in Moldova",
        "assignee_id": 33,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "bc736a06-eeb0-4271-b4a8-c66f61b5df1f",
        "created_at": "2016-01-30T03:20:48-11:00",
        "type": "incident",
        "subject": "A Catastrophe in Peru",
        "assignee_id": 17,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "cdc9926f-e44a-4530-af17-903cf2fa3cdf",
        "created_at": "2016-02-02T09:05:59-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Rwanda",
        "assignee_id": 17,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "d546aa72-01ce-48cf-a24d-3b1577271791",
        "created_at": "2016-06-19T06:37:51-10:00",
        "type": "question",
        "subject": "A Nuisance in Sweden",
        "assignee_id": 6,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "4eea5790-b490-4dee-877f-808d86cbd1a8",
        "created_at": "2016-02-26T06:34:34-11:00",
        "type": "problem",
        "subject": "A Çatastrophe in Sudan",
        "assignee_id": 73,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "cb304286-7064-4509-813e-edc36d57623d",
        "created_at": "2016-03-30T11:43:24-11:00",
        "type": "task",
        "subject": "A Nuisance in Saint Lucia",
        "assignee_id": 11,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "f2379173-6083-49f9-a001-8310f6478b4e",
        "created_at": "2016-01-27T03:45:05-11:00",
        "type": "task",
        "subject": "A Catastrophe in Bahrain",
        "assignee_id": 8,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "1fafaa2a-a1e9-4158-aeb4-f17e64615300",
        "created_at": "2016-01-15T11:52:49-11:00",
        "type": "problem",
        "subject": "A Problem in Russian Federation",
        "assignee_id": 1,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "7523607d-d45c-4e3a-93aa-419402e64d73",
        "created_at": "2016-04-06T06:55:28-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Sao Tome and Principe",
        "assignee_id": 33,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "6ed590ac-e385-46e2-a27a-50628a658168",
        "created_at": "2016-03-03T05:35:49-11:00",
        "type": "task",
        "subject": "A Problem in Uzbekistan",
        "assignee_id": 44,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "0ca339ca-b056-4e1a-85ef-b1113c331660",
        "created_at": "2016-02-19T02:50:01-11:00",
        "type": "incident",
        "subject": "A Drama in Chad",
        "assignee_id": 22,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "ed3432e1-8cb7-40a1-be6a-6f69cbc911f1",
        "created_at": "2016-05-02T05:45:35-10:00",
        "type": "task",
        "subject": "A Drama in Viet Nam",
        "assignee_id": 70,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "27ab7105-e852-42f3-91a3-2d77c7a0c3fc",
        "created_at": "2016-02-27T03:26:47-11:00",
        "type": "task",
        "subject": "A Drama in Australia",
        "assignee_id": 7,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "5f7a19db-432e-4d6f-8c29-ba121aed5d68",
        "created_at": "2016-05-28T06:33:28-10:00",
        "type": "question",
        "subject": "A Problem in Cambodia",
        "assignee_id": 23,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "6e77bbf1-5fc7-4f41-aeb1-74f8730f974b",
        "created_at": "2016-06-24T07:57:38-10:00",
        "type": "problem",
        "subject": "A Problem in Guatemala",
        "assignee_id": 26,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "703d347c-eaeb-402b-9890-b4736649b9ce",
        "created_at": "2016-02-09T05:20:20-11:00",
        "type": "problem",
        "subject": "A Problem in Madagascar",
        "assignee_id": 68,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "4d22436c-6c26-431b-9083-35ec8e86c57d",
        "created_at": "2016-04-11T04:56:30-10:00",
        "type": "incident",
        "subject": "A Nuisance in Tanzania",
        "assignee_id": 15,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "a25f90f3-2157-4585-bbee-360367a2c1e8",
        "created_at": "2016-02-22T03:53:00-11:00",
        "type": "incident",
        "subject": "A Drama in Mauritania",
        "assignee_id": 27,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "e34262a7-df37-4715-a482-fb0acb5d0b46",
        "created_at": "2016-05-16T08:07:14-10:00",
        "type": "incident",
        "subject": "A Drama in Mongolia",
        "assignee_id": 73,
        "tags": [
          "Şouth Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "7251d3d2-a735-487d-9481-243c3048f171",
        "created_at": "2016-03-18T04:55:44-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Gibraltar",
        "assignee_id": 21,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "3b704035-0ccc-48b4-98ac-1b4911e9bfcc",
        "created_at": "2016-04-18T01:13:23-10:00",
        "type": "problem",
        "subject": "A Nuisance in Fiji",
        "assignee_id": 64,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "d4c901be-7094-4f65-8a9b-43df949d5344",
        "created_at": "2016-02-27T04:42:56-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Palau",
        "assignee_id": 39,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "774765fe-7123-4131-8822-e855d3cad14c",
        "created_at": "2016-06-23T06:08:21-10:00",
        "type": "task",
        "subject": "A Drama in Germany",
        "assignee_id": 12,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "Şouth Dakota",
          "Montana"
        ]
      },
      {
        "_id": "ffe688cd-402f-4e37-8597-88b3811bbf46",
        "created_at": "2016-02-03T05:47:00-11:00",
        "type": "question",
        "subject": "A Problem in Vatican City Ştate (Holy See)",
        "assignee_id": 29,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "de70eb6b-0717-40f9-9322-75f1262cda12",
        "created_at": "2016-01-31T10:26:16-11:00",
        "type": "incident",
        "subject": "A Drama in Saudi Arabia",
        "assignee_id": 5,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "8ea53283-5b36-4328-9a78-f261ee90f44b",
        "created_at": "2016-03-07T03:00:54-11:00",
        "type": "task",
        "subject": "A Catastrophe in Sierra Leone",
        "assignee_id": 71,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "c71606b7-42f1-4390-8549-dfd87707969b",
        "created_at": "2016-06-23T05:02:27-10:00",
        "type": "question",
        "subject": "A Drama in United Arab Emirates",
        "assignee_id": 35,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "6403bd08-b7a0-49a3-a843-14ccb8ebbfca",
        "created_at": "2016-02-14T12:25:53-11:00",
        "type": "question",
        "subject": "A Drama in El Salvador",
        "assignee_id": 73,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "5315f036-2bdd-4d6e-a356-fc6759c74351",
        "created_at": "2016-02-21T10:52:48-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Central African Republic",
        "assignee_id": 14,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "77852bfb-5f33-4667-acf4-16e15d6c95d5",
        "created_at": "2016-07-28T10:26:16-10:00",
        "type": "task",
        "subject": "A Nuisance in Cote D'Ivoire (Ivory Coast)",
        "assignee_id": 47,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "cf0d4a27-0dcb-49a9-a4fd-beec25742799",
        "created_at": "2016-05-25T07:34:21-10:00",
        "type": "task",
        "subject": "A Catastrophe in Brazil",
        "assignee_id": 23,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "0395f415-a863-424d-8f07-27c67340c599",
        "created_at": "2016-01-24T03:20:04-11:00",
        "type": "question",
        "subject": "A Nuisance in Iceland",
        "assignee_id": 17,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "92e5d8f0-853a-4f56-b7fb-b0582e6b1c79",
        "created_at": "2016-01-06T09:27:57-11:00",
        "type": "incident",
        "subject": "A Drama in Nepal",
        "assignee_id": 72,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "efda0e9f-f8a5-408e-bcf0-9c5665aa5931",
        "created_at": "2016-05-04T12:34:13-10:00",
        "type": "problem",
        "subject": "A Nuisance in Andorra",
        "assignee_id": 36,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "828c158a-91e3-42b9-8aed-ac97407a150f",
        "created_at": "2016-04-10T11:55:28-10:00",
        "type": "task",
        "subject": "A Drama in Israel",
        "assignee_id": 54,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "7e3b58e9-1235-40ee-a0c1-819153fb3dae",
        "created_at": "2016-02-07T12:59:35-11:00",
        "type": "question",
        "subject": "A Problem in Oman",
        "assignee_id": 10,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "c48bf827-fc45-4158-b7ce-70784509f562",
        "created_at": "2016-05-18T12:13:28-10:00",
        "type": "incident",
        "subject": "A Catastrophe in New Zealand",
        "assignee_id": 55,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "0f823d66-7e6e-4867-949f-1308a25ab2b0",
        "created_at": "2016-04-03T06:23:21-10:00",
        "type": "incident",
        "subject": "A Catastrophe in Iran",
        "assignee_id": 19,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "5799c5e4-2c48-4319-8c5b-88df58ebbd12",
        "created_at": "2016-01-31T12:08:24-11:00",
        "type": "incident",
        "subject": "A Nuisance in French Polynesia",
        "assignee_id": 8,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "0f0868ba-518c-4e1b-b286-41e0937c4e7c",
        "created_at": "2016-04-11T02:30:02-10:00",
        "type": "task",
        "subject": "A Problem in Reunion",
        "assignee_id": 45,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "4af3bbbd-661f-4348-be25-47c6f7d36009",
        "created_at": "2016-01-31T05:08:27-11:00",
        "type": "question",
        "subject": "A Catastrophe in Yugoslavia",
        "assignee_id": 46,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "6fed7d01-15dd-4b59-94f9-1093b4bc0995",
        "created_at": "2016-06-03T06:03:33-10:00",
        "type": "task",
        "subject": "A Catastrophe in Bermuda",
        "assignee_id": 2,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "34cf9dc4-c0a2-4925-b579-1a9c65efa488",
        "created_at": "2016-03-17T08:04:05-11:00",
        "type": "question",
        "subject": "A Catastrophe in Ecuador",
        "assignee_id": 40,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "c45893d9-17c2-43b0-8800-a5f8201aff93",
        "created_at": "2016-05-08T05:42:21-10:00",
        "type": "problem",
        "subject": "A Nuisance in Bhutan",
        "assignee_id": 26,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "5c66cef0-7abc-46df-b487-5f8eb6208422",
        "created_at": "2016-04-20T08:33:14-10:00",
        "type": "question",
        "subject": "A Problem in Switzerland",
        "assignee_id": 37,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "1153a9d0-80b8-45f8-9753-e1c004caea7b",
        "created_at": "2016-03-03T09:32:40-11:00",
        "type": "incident",
        "subject": "A Drama in Canada",
        "assignee_id": 8,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "3d5ec1b4-509c-45de-8338-4934531d48f3",
        "created_at": "2016-06-02T06:02:55-10:00",
        "type": "task",
        "subject": "A Catastrophe in Bouvet Island",
        "assignee_id": 32,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "6a075290-6f77-4d70-87f2-e4867591772c",
        "created_at": "2016-01-11T05:43:49-11:00",
        "type": "problem",
        "subject": "A Drama in Botswana",
        "assignee_id": 5,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "31e7f6d7-f6cb-4781-b4e7-2f552941e1f5",
        "created_at": "2016-04-25T02:22:03-10:00",
        "type": "incident",
        "subject": "A Nuisance in Poland",
        "assignee_id": 63,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "f75ef2ed-da4f-417c-b164-3dd2c9c8f87c",
        "created_at": "2016-03-29T10:53:31-11:00",
        "type": "question",
        "subject": "A Nuisance in Uganda",
        "assignee_id": 43,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "f21a653e-6576-4cc8-a848-70d1f9ab5d1c",
        "created_at": "2016-06-05T04:22:20-10:00",
        "type": "task",
        "subject": "A Nuisance in Slovenia",
        "assignee_id": 52,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "3de7b115-9525-4e97-bcc3-a8d124b0fb78",
        "created_at": "2016-06-07T05:42:09-10:00",
        "type": "problem",
        "subject": "A Problem in Dominica",
        "assignee_id": 74,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "ae45041d-1bd0-4ed2-a298-ab2be3b0c7c7",
        "created_at": "2016-02-08T06:27:01-11:00",
        "type": "problem",
        "subject": "A Drama in Mayotte",
        "assignee_id": 26,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "ec987652-c323-4368-899d-f3c357ff4b87",
        "created_at": "2016-05-02T12:31:05-10:00",
        "type": "question",
        "subject": "A Nuisance in Suriname",
        "assignee_id": 39,
        "tags": [
          "Rhodé Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "ba4feaec-47ac-483f-bc3d-2604f797e6f0",
        "created_at": "2016-03-10T05:32:06-11:00",
        "type": "question",
        "subject": "A Catastrophe in Belize",
        "assignee_id": 24,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "018ed12d-86bb-4379-a679-1184264ac5a2",
        "created_at": "2016-05-17T08:27:45-10:00",
        "type": "problem",
        "subject": "A Nuisance in Tokelau",
        "assignee_id": 69,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "27912e49-d6bc-448b-a710-50c31af3a9ea",
        "created_at": "2016-06-29T02:16:13-10:00",
        "type": "question",
        "subject": "A Drama in Argentina",
        "assignee_id": 34,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "d8cf9df6-946c-4371-9e3d-50b83fa4238e",
        "created_at": "2016-04-03T09:49:35-10:00",
        "type": "question",
        "subject": "A Catastrophe in Cuba",
        "assignee_id": 59,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "710bf26b-d65b-4712-95aa-4d123c06e0d7",
        "created_at": "2016-02-01T11:47:51-11:00",
        "type": "task",
        "subject": "A Nuisance in Costa Rica",
        "assignee_id": 57,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "05291c66-f705-45a9-834d-4f594b236ff6",
        "created_at": "2016-02-12T10:47:55-11:00",
        "type": "task",
        "subject": "A Drama in Saint Vincent and The Grenadines",
        "assignee_id": 50,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "5613ffcb-8a33-4341-9be7-1534ae1050bc",
        "created_at": "2016-01-18T08:51:11-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Thailand",
        "assignee_id": 33,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "9216c7b3-9a7b-40cb-8f96-56fca79520eb",
        "created_at": "2016-03-30T03:13:04-11:00",
        "type": "task",
        "subject": "A Problem in Marshall Islands",
        "assignee_id": 34,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "9fe171f6-8790-4d8c-9463-b90052ee7423",
        "created_at": "2016-02-11T03:00:48-11:00",
        "type": "incident",
        "subject": "A Nuisance in United States",
        "assignee_id": 72,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "4cd61a2d-22bf-467c-9db0-a082b1125394",
        "created_at": "2016-07-05T09:21:49-10:00",
        "type": "problem",
        "subject": "A Drama in Nigeria",
        "assignee_id": 46,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "de845e37-6082-4c5b-a1f5-1645cedf09f0",
        "created_at": "2016-06-04T05:40:56-10:00",
        "type": "task",
        "subject": "A Catastrophe in Jordan",
        "assignee_id": 50,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "045b0fe9-8e17-4eec-af9c-cc00ce5b9ed1",
        "created_at": "2016-07-05T04:41:00-10:00",
        "type": "task",
        "subject": "A Drama in Mauritius",
        "assignee_id": 58,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "df1a642a-e704-4556-af79-98a63b59401d",
        "created_at": "2016-06-13T04:59:19-10:00",
        "type": "question",
        "subject": "A Nuisance in Eritrea",
        "assignee_id": 50,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "d9448e74-4a7d-45c5-9548-8b4fee714b29",
        "created_at": "2016-04-09T07:56:36-10:00",
        "type": "problem",
        "subject": "A Nuisance in Honduras",
        "assignee_id": 30,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "ea9f4344-ed67-4b7c-afae-dd4c1778b5be",
        "created_at": "2016-05-19T12:38:19-10:00",
        "type": "problem",
        "subject": "A Nuisance in Vanuatu",
        "assignee_id": 74,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "ccf4c82c-f572-4fd2-82a6-11d6055929b8",
        "created_at": "2016-01-20T12:45:55-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Lebanon",
        "assignee_id": 52,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "189eed9f-b44c-49f3-a904-2c482193996a",
        "created_at": "2016-07-05T07:08:28-10:00",
        "type": "task",
        "subject": "A Catastrophe in Singapore",
        "assignee_id": 57,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "4c5a405d-0805-4d8b-ac48-2a3d7f3816e4",
        "created_at": "2016-03-08T04:22:35-11:00",
        "type": "incident",
        "subject": "A Drama in Haiti",
        "assignee_id": 16,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "dcb9143e-cb17-49ea-a9be-abf6989bd2d4",
        "created_at": "2016-06-10T05:46:41-10:00",
        "type": "task",
        "subject": "A Problem in Svalbard and Jan Mayen Islands",
        "assignee_id": 2,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "fa3a37e3-942e-4048-81bc-d0d7e79cb686",
        "created_at": "2016-05-21T03:40:33-10:00",
        "type": "question",
        "subject": "A Drama in France, Metropolitan",
        "assignee_id": 67,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "140e0cd4-c31b-4e90-833d-c42a12d4b713",
        "created_at": "2016-03-12T11:33:46-11:00",
        "type": "incident",
        "subject": "A Nuisance in Macedonia",
        "assignee_id": 24,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "c527e065-ec62-40ed-aa72-136f5ab0eb89",
        "created_at": "2016-02-19T07:11:16-11:00",
        "type": "question",
        "subject": "A Catastrophe in France",
        "assignee_id": 30,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "e0e5ab4a-a776-40ec-8768-64d83a342d82",
        "created_at": "2016-07-26T03:22:46-10:00",
        "type": "task",
        "subject": "A Drama in Albania",
        "assignee_id": 54,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "cc3694e5-ea5f-40a0-9eb7-e12ee2917c8a",
        "created_at": "2016-01-13T01:19:45-11:00",
        "type": "problem",
        "subject": "A Drama in Qatar",
        "assignee_id": 28,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "8d7b4d51-ef95-4923-9ab8-42332ab2188d",
        "created_at": "2016-05-30T02:40:22-10:00",
        "type": "question",
        "subject": "A Catastrophe in Malta",
        "assignee_id": 8,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "eba628f6-5c97-4f4e-b39d-fb78850661df",
        "created_at": "2016-05-22T10:47:17-10:00",
        "type": "task",
        "subject": "A Problem in Brunei Darussalam",
        "assignee_id": 70,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "92c88581-f778-42bc-a828-0000afaa9588",
        "created_at": "2016-02-17T04:36:13-11:00",
        "type": "incident",
        "subject": "A Nuisance in Virgin Islands (British)",
        "assignee_id": 6,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "3496c5af-f472-4484-b0a9-65f1353ee948",
        "created_at": "2016-05-09T12:14:10-10:00",
        "type": "problem",
        "subject": "A Nuisance in Luxembourg",
        "assignee_id": 41,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "6a391c4f-d68b-489b-9874-e00631527cee",
        "created_at": "2016-03-01T06:00:12-11:00",
        "type": "question",
        "subject": "A Catastrophe in Armenia",
        "assignee_id": 17,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "92ab4d58-39fa-4a25-a1ff-c61eebaf2cdb",
        "created_at": "2016-05-06T09:55:37-10:00",
        "type": "problem",
        "subject": "A Nuisance in Tajikistan",
        "assignee_id": 24,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "945ce2d3-3edc-4936-8d51-e59e74cf917a",
        "created_at": "2016-04-23T05:47:03-10:00",
        "type": "task",
        "subject": "A Drama in Guinea",
        "assignee_id": 32,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "e23bf143-c5a3-4482-aff4-67df77f87d24",
        "created_at": "2016-03-08T01:03:02-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Belarus",
        "assignee_id": 19,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "10378588-afec-443e-a0a5-6c707eb1c2e4",
        "created_at": "2016-03-28T02:19:47-11:00",
        "type": "problem",
        "subject": "A Catastrophe in Tuvalu",
        "assignee_id": 61,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "1fcfe2d4-ba1d-45a9-8cbb-3af610f3a673",
        "created_at": "2016-07-05T05:19:42-10:00",
        "type": "problem",
        "subject": "A Nuisance in Estonia",
        "assignee_id": 15,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "55135930-9f1f-43df-a9fd-2105fff74578",
        "created_at": "2016-03-24T08:06:32-11:00",
        "type": "problem",
        "subject": "A Problem in Mexico",
        "assignee_id": 49,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "f1fafe1e-6328-4c51-970b-fc743917ce4e",
        "created_at": "2016-01-13T11:04:00-11:00",
        "type": "problem",
        "subject": "A Drama in Cameroon",
        "assignee_id": 5,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "e75e6904-6536-43ea-9081-1c9f787f8682",
        "created_at": "2016-03-01T03:50:31-11:00",
        "type": "task",
        "subject": "A Problem in French Southern Territories",
        "assignee_id": 3,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "69e3949d-1be3-439d-8bab-47d2827396d0",
        "created_at": "2016-03-14T01:53:19-11:00",
        "type": "question",
        "subject": "A Drama in Belgium",
        "assignee_id": 31,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "0ebe753c-9c78-458a-817f-3993780bedbf",
        "created_at": "2016-05-19T12:19:56-10:00",
        "type": "problem",
        "subject": "A Nuisance in Seychelles",
        "assignee_id": 56,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "6c0406da-481e-414a-9dc5-8d7aec832e67",
        "created_at": "2016-07-05T06:06:23-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Faroe Islands",
        "assignee_id": 6,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "ad49f154-2ceb-4052-9129-ddc6d4b7e479",
        "created_at": "2016-05-17T08:32:44-10:00",
        "type": "question",
        "subject": "A Problem in Kyrgyzstan",
        "assignee_id": 31,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      },
      {
        "_id": "e804d348-2317-43b2-882a-b29d1a8acc94",
        "created_at": "2016-07-05T07:25:54-10:00",
        "type": "problem",
        "subject": "A Nuisance in Grenada",
        "assignee_id": 59,
        "tags": [
          "South Dakota",
          "Montana",
          "District Of Columbia",
          "Wisconsin"
        ]
      },
      {
        "_id": "fd26f66a-5688-43ad-8890-c3d65f84c6c0",
        "created_at": "2016-07-17T07:47:47-10:00",
        "type": "problem",
        "subject": "A Drama in Kazakhstan",
        "assignee_id": 68,
        "tags": [
          "Illinois",
          "Fédératéd Statés Of Micronésia",
          "Rhode Island",
          "Kansas"
        ]
      },
      {
        "_id": "30094238-46cd-4921-b1c1-4757906cd028",
        "created_at": "2016-03-24T10:39:29-11:00",
        "type": "question",
        "subject": "A Catastrophe in Bahamas",
        "assignee_id": 41,
        "tags": [
          "Guam",
          "Colorado",
          "Washington",
          "Wyoming"
        ]
      },
      {
        "_id": "c6c851a6-fbe6-4736-a465-6f1859a511dd",
        "created_at": "2016-05-12T04:42:00-10:00",
        "type": "question",
        "subject": "A Drama in Monaco",
        "assignee_id": 73,
        "tags": [
          "Ohio",
          "Pennsylvania",
          "American Samoa",
          "Northern Mariana Islands"
        ]
      },
      {
        "_id": "7a0b41db-f910-4814-8d75-1e0915ec5d27",
        "created_at": "2016-03-15T07:32:22-11:00",
        "type": "question",
        "subject": "A Drama in Bolivia",
        "assignee_id": 47,
        "tags": [
          "Puerto Rico",
          "Idaho",
          "Oklahoma",
          "Louisiana"
        ]
      },
      {
        "_id": "59cc8598-7f44-4b4c-a57f-e65e8ad67323",
        "created_at": "2016-07-21T11:35:59-10:00",
        "type": "incident",
        "subject": "A Problem in Antarctica",
        "assignee_id": 65,
        "tags": [
          "Massachusetts",
          "New York",
          "Minnesota",
          "New Jersey"
        ]
      },
      {
        "_id": "bb8b1829-25d9-4534-83a2-c4e6086d76d4",
        "created_at": "2016-03-20T11:08:16-11:00",
        "type": "task",
        "subject": "A Problem in Japan",
        "assignee_id": 42,
        "tags": [
          "Texas",
          "Nevada",
          "Oregon",
          "Arizona"
        ]
      },
      {
        "_id": "6e146832-0c37-4fb5-b173-a7e89bce4aff",
        "created_at": "2016-02-10T06:55:39-11:00",
        "type": "problem",
        "subject": "A Nuisance in Tunisia",
        "assignee_id": 70,
        "tags": [
          "Delaware",
          "New Hampshire",
          "Utah",
          "Hawaii"
        ]
      },
      {
        "_id": "ea69e0c0-d1b8-462e-a654-b571666e6253",
        "created_at": "2016-05-07T04:41:10-10:00",
        "type": "task",
        "subject": "A Drama in Martinique",
        "assignee_id": 19,
        "tags": [
          "Alaska",
          "Maryland",
          "Iowa",
          "North Dakota"
        ]
      },
      {
        "_id": "dae7a200-89b8-4a43-a17d-93c8f33a2aaa",
        "created_at": "2016-02-06T03:56:09-11:00",
        "type": "task",
        "subject": "A Problem in Ukraine",
        "assignee_id": 63,
        "tags": [
          "California",
          "Palau",
          "Kentucky",
          "North Carolina"
        ]
      },
      {
        "_id": "eb169da9-43f9-471e-97de-5f3f424e819f",
        "created_at": "2016-01-15T11:55:22-11:00",
        "type": "problem",
        "subject": "A Problem in Malaysia",
        "assignee_id": 22,
        "tags": [
          "South Carolina",
          "Indiana",
          "New Mexico",
          "Nebraska"
        ]
      },
      {
        "_id": "0533df4e-488f-45dd-b4b8-e238be0690ed",
        "created_at": "2016-04-27T07:58:36-10:00",
        "type": "task",
        "subject": "A Drama in Bulgaria",
        "assignee_id": 47,
        "tags": [
          "Connecticut",
          "Arkansas",
          "Missouri",
          "Alabama"
        ]
      },
      {
        "_id": "89255552-e9a2-433b-970a-af194b3a39dd",
        "created_at": "2016-01-20T01:23:55-11:00",
        "type": "task",
        "subject": "A Problem in Turks and Caicos Islands",
        "assignee_id": 52,
        "tags": [
          "Virginia",
          "Virgin Islands",
          "Maine",
          "West Virginia"
        ]
      },
      {
        "_id": "196721ae-1691-4113-901d-4e39675a22c1",
        "created_at": "2016-06-18T04:16:03-10:00",
        "type": "problem",
        "subject": "A Drama in Puerto Rico",
        "assignee_id": 72,
        "tags": [
          "Michigan",
          "Florida",
          "Georgia",
          "Tennessee"
        ]
      },
      {
        "_id": "27c447d9-cfda-4415-9a72-d5aa12942cf1",
        "created_at": "2016-01-31T07:43:00-11:00",
        "type": "incident",
        "subject": "A Problem in Guyana",
        "assignee_id": 74,
        "tags": [
          "Mississippi",
          "Marshall Islands",
          "South Dakota",
          "Montana"
        ]
      },
      {
        "_id": "04ae0b9c-ded7-44c4-899c-d7348fc17b45",
        "created_at": "2016-02-11T12:47:58-11:00",
        "type": "task",
        "subject": "A Catastrophe in Cape Verde",
        "assignee_id": 59,
        "tags": [
          "District Of Columbia",
          "Wisconsin",
          "Illinois",
          "Fédératéd Statés Of Micronésia"
        ]
      },
      {
        "_id": "cb7cae87-2915-44d4-bda4-4ccb59c63bd4",
        "created_at": "2016-02-15T08:26:42-11:00",
        "type": "incident",
        "subject": "A Drama in S. Georgia and S. Sandwich Isls.",
        "assignee_id": 35,
        "tags": [
          "Rhode Island",
          "Kansas",
          "Guam",
          "Colorado"
        ]
      },
      {
        "_id": "a12a5f33-d4a0-4e43-8773-4b22e16fc0c8",
        "created_at": "2016-04-26T06:22:28-10:00",
        "type": "question",
        "subject": "A Nuisance in Liberia",
        "assignee_id": 74,
        "tags": [
          "Washington",
          "Wyoming",
          "Ohio",
          "Pennsylvania"
        ]
      },
      {
        "_id": "a7b16a5c-76d9-4e60-aadc-33653b828173",
        "created_at": "2016-04-10T03:31:51-10:00",
        "type": "incident",
        "subject": "A Problem in Saint Kitts and Nevis",
        "assignee_id": 47,
        "tags": [
          "American Samoa",
          "Northern Mariana Islands",
          "Puerto Rico",
          "Idaho"
        ]
      },
      {
        "_id": "c702e937-5f2d-4d34-878a-fcb7d1ddf6aa",
        "created_at": "2016-05-25T12:48:45-10:00",
        "type": "question",
        "subject": "A Drama in Zimbabwe",
        "assignee_id": 46,
        "tags": [
          "Oklahoma",
          "Louisiana",
          "Massachusetts",
          "New York"
        ]
      },
      {
        "_id": "4d0ab657-4c59-43e4-aab3-162753043a59",
        "created_at": "2016-01-25T03:59:49-11:00",
        "type": "question",
        "subject": "A Problem in Algeria",
        "assignee_id": 555,
        "tags": [
          "Minnesota",
          "New Jersey",
          "Texas",
          "Nevada"
        ]
      },
      {
        "_id": "53ae78d0-40a9-444f-9a47-bc0bf064d2ee",
        "created_at": "2016-06-30T07:12:07-10:00",
        "type": "problem",
        "subject": "A Problem in Trinidad and Tobago",
        "assignee_id": 23,
        "tags": [
          "Oregon",
          "Arizona",
          "Delaware",
          "New Hampshire"
        ]
      },
      {
        "_id": "53867869-0db0-4b8d-9d6c-9d1c0af4e693",
        "created_at": "2016-05-14T09:19:56-10:00",
        "type": "task",
        "subject": "A Drama in Gabon",
        "assignee_id": 5,
        "tags": [
          "Utah",
          "Hawaii",
          "Alaska",
          "Maryland"
        ]
      },
      {
        "_id": "7ef6cf9f-121d-41e7-832c-68d811da9379",
        "created_at": "2016-06-26T04:34:33-10:00",
        "type": "problem",
        "subject": "A Catastrophe in Netherlands Antilles",
        "assignee_id": 51,
        "tags": [
          "Iowa",
          "North Dakota",
          "California",
          "Palau"
        ]
      },
      {
        "_id": "59d803f6-a9cd-448c-a6bd-91ce9f044305",
        "created_at": "2016-02-15T05:41:05-11:00",
        "type": "task",
        "subject": "A Drama in Burundi",
        "assignee_id": 15,
        "tags": [
          "Kentucky",
          "North Carolina",
          "South Carolina",
          "Indiana"
        ]
      },
      {
        "_id": "13aafde0-81db-47fd-b1a2-94b0015803df",
        "created_at": "2016-03-30T08:35:27-11:00",
        "type": "task",
        "subject": "A Problem in Malawi",
        "assignee_id": 1,
        "tags": [
          "New Mexico",
          "Nebraska",
          "Connecticut",
          "Arkansas"
        ]
      },
      {
        "_id": "7382ad0e-dea7-4c8d-b38f-cbbf016f2598",
        "created_at": "2016-03-31T03:16:52-11:00",
        "type": "task",
        "subject": "A Problem in American Samoa",
        "assignee_id": 64,
        "tags": [
          "Missouri",
          "Alabama",
          "Virginia",
          "Virgin Islands"
        ]
      },
      {
        "_id": "50f3fdbd-f8a6-481d-9bf7-572972856628",
        "created_at": "2016-05-19T08:52:06-10:00",
        "type": "incident",
        "subject": "A Nuisance in Namibia",
        "assignee_id": 12,
        "tags": [
          "Maine",
          "West Virginia",
          "Michigan",
          "Florida"
        ]
      },
      {
        "_id": "50dfc8bc-31de-411e-92bf-a6d6b9dfa490",
        "created_at": "2016-03-08T09:44:54-11:00",
        "type": "task",
        "subject": "A Problem in South Africa",
        "assignee_id": 54,
        "tags": [
          "Georgia",
          "Tennessee",
          "Mississippi",
          "Marshall Islands"
        ]
      }
    ]
""".trimIndent()