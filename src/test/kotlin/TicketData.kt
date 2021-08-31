package dto.test.data

val ticketWithAssignee : String = """
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
  }
""".trimIndent()


val ticketWithoutAssignee : String = """
    {
    "assignee_id": 24,
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
  }
""".trimIndent()

val ticketWithoutType: String = """
    {
    "_id": "c68cb7d7-b517-4d0b-a826-9605423e78c2",
    "created_at": "2016-03-09T01:39:48-11:00",
    "subject": "A Problem in Western Sahara",
    "tags": [
      "Massachusetts",
      "New York",
      "Minnesota",
      "New Jersey"
    ]
  }
""".trimIndent()