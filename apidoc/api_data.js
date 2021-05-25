define({ "api": [
  {
    "type": "GET",
    "url": "/artstudio/all",
    "title": "queryAllShow",
    "version": "1.0.0",
    "group": "ArtstudioController",
    "name": "queryAllShow",
    "description": "<p>查询所有展示的artstudio, should be show 1。后台使用，image_url不处理，后台，且列表不展示图</p>",
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ArtstudioController.java",
    "groupTitle": "ArtstudioController"
  },
  {
    "type": "GET",
    "url": "/artstudio/{id}",
    "title": "selectOne",
    "version": "1.0.0",
    "group": "ArtstudioController",
    "name": "selectOne",
    "description": "<p>选择一个工作室管理页面</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "id=2221",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ArtstudioController.java",
    "groupTitle": "ArtstudioController"
  },
  {
    "type": "GET",
    "url": "/artwork/{id}",
    "title": "OneArtwork",
    "version": "1.0.0",
    "group": "ArtworkController",
    "name": "OneArtwork",
    "description": "<p>通过主键查询单条作品</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "id=495",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ArtworkController.java",
    "groupTitle": "ArtworkController"
  },
  {
    "type": "GET",
    "url": "/artwork/all",
    "title": "queryArtworksNewUpdate",
    "version": "1.0.0",
    "group": "ArtworkController",
    "name": "queryArtworksNewUpdate",
    "description": "<p>查询所有可展示作品，根据修改时间先新后旧</p>",
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ArtworkController.java",
    "groupTitle": "ArtworkController"
  },
  {
    "type": "GET",
    "url": "/artwork/manuid/{manuId}",
    "title": "queryArtworksNewUpdate",
    "version": "1.0.0",
    "group": "ArtworkController",
    "name": "queryArtworksNewUpdate",
    "description": "<p>查询对应manuId下可展示作品，根据修改时间先新后旧</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "manuId",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "manuId=5445",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ArtworkController.java",
    "groupTitle": "ArtworkController"
  },
  {
    "type": "GET",
    "url": "/banner/limitbanners",
    "title": "queryLimitArtstudios",
    "version": "1.0.0",
    "group": "BannerController",
    "name": "queryLimitArtstudios",
    "description": "<p>查询X个banners, 限制目前是6个, should be show 1</p>",
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/BannerController.java",
    "groupTitle": "BannerController"
  },
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "C:/TrueDepartment/art_room/apidoc/main.js",
    "group": "C:\\TrueDepartment\\art_room\\apidoc\\main.js",
    "groupTitle": "C:\\TrueDepartment\\art_room\\apidoc\\main.js",
    "name": ""
  },
  {
    "type": "POST",
    "url": "/commentReply",
    "title": "insertOneCommentReply",
    "version": "1.0.0",
    "group": "CommentReplyController",
    "name": "insertOneCommentReply",
    "description": "<p>新增评论或者留言一个</p>",
    "parameter": {
      "fields": {
        "请求体": [
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "createdAt",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "updatedAt",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "editorId",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "artworkId",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>comment shows1;noshow0;administrators' reply2</p>"
          },
          {
            "group": "请求体",
            "type": "Number",
            "optional": false,
            "field": "parentId",
            "description": ""
          },
          {
            "group": "请求体",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求体示例",
          "content": "{\"createdAt\":1678,\"editorId\":6900,\"artworkId\":8177,\"id\":3060,\"parentId\":4350,\"content\":\"AzLfnNst0\",\"updatedAt\":7315,\"status\":2955}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/CommentReplyController.java",
    "groupTitle": "CommentReplyController"
  },
  {
    "type": "GET",
    "url": "/commentReply/allcommentreply/{artworkId}",
    "title": "queryArtworkIdCommentAndReply",
    "version": "1.0.0",
    "group": "CommentReplyController",
    "name": "queryArtworkIdCommentAndReply",
    "description": "<p>查询作品Id下所有留言评论, 层级展示 return 对象列表,层级展示</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "artworkId",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "artworkId=5454",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/CommentReplyController.java",
    "groupTitle": "CommentReplyController"
  },
  {
    "type": "GET",
    "url": "/commentReply/all/{artworkId}",
    "title": "queryShowByArtworkId",
    "version": "1.0.0",
    "group": "CommentReplyController",
    "name": "queryShowByArtworkId",
    "description": "<p>查询作品Id下所有留言评论。return 对象列表,平板带parent_id</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "artworkId",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "artworkId=6705",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/CommentReplyController.java",
    "groupTitle": "CommentReplyController"
  },
  {
    "type": "GET",
    "url": "/manu/manuVoTree/{rootId}",
    "title": "queryAllChildrenManuVos",
    "version": "1.0.0",
    "group": "ManuController",
    "name": "queryAllChildrenManuVos",
    "description": "<p>查询root下所有目录, should be show 1 return 导航栏tree</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "rootId",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "rootId=8841",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ManuController.java",
    "groupTitle": "ManuController"
  },
  {
    "type": "GET",
    "url": "/manu/sortedlist/{rootId}",
    "title": "queryAllChildrenManus",
    "version": "1.0.0",
    "group": "ManuController",
    "name": "queryAllChildrenManus",
    "description": "<p>查询root下所有目录, should be show 1 return 对象列表,平板带parent_id</p>",
    "parameter": {
      "fields": {
        "请求参数": [
          {
            "group": "请求参数",
            "type": "Number",
            "optional": false,
            "field": "rootId",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数示例",
          "content": "rootId=2216",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "响应结果": [
          {
            "group": "响应结果",
            "type": "Object",
            "optional": false,
            "field": "response",
            "description": ""
          }
        ]
      },
      "examples": [
        {
          "title": "响应结果示例",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "filename": "C:/TrueDepartment/art_room/src/main/java/com/nicole/ssm/controller/ManuController.java",
    "groupTitle": "ManuController"
  }
] });
