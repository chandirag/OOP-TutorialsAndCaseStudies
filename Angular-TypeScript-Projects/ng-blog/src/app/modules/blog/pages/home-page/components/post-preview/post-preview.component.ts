import { Component, Input, OnInit } from '@angular/core';
import { IPost } from 'src/app/modules/blog/core/types/post.types';

@Component({
  selector: 'app-post-preview',
  templateUrl: './post-preview.component.html',
  styleUrls: ['./post-preview.component.css']
})
export class PostPreviewComponent implements OnInit {

  @Input() postItem:IPost = null;
  constructor() { }

  ngOnInit() {
  }

}
